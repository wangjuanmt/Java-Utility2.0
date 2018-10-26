# Spring boot use issues

## Issue 1: SpringBoot中获取spring.profiles.active的值
You can use ApplicationContextAware.
ApplicationContextAware:
Interface to be implemented by any object that wishes to be notified of the ApplicationContext that it runs in.
Implementing this interface makes sense for example when an object requires access to a set of collaborating beans.

When Spring instantiates beans, it looks for ApplicationContextAware implementations, If they are found, the setApplicationContext() methods will be invoked.

In this way, Spring is setting current applicationcontext.

See [How to get bean using application context in spring boot](https://stackoverflow.com/questions/34088780/how-to-get-bean-using-application-context-in-spring-boot)

根据以上说明，我们做了SpringContextUtil.java, 只要在需要的地方调用SpringContextUtil.getActiveProfile 就可以获取spring.profiles.active的值， 这样就能在代码级别通过环境条件来控制方法行为了。

但是在使用过程中发现在SpringBootApplication的main方法执行
`SpringApplication.run(BeatlesApplication.class, args);`之前，调用`SpringContextUtil.getActiveProfile`则出现`NullPointerException`，
如下代码：

 ``````
 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 @SpringBootApplication
 public class Application {

 	public static void main(String[] args) {

 		String profile = System.getenv("spring.profiles.active"); // It is null no matter where to call System.getenv("spring.profiles.active").
 		profile = SpringContextUtil.getActiveProfile(); // NullPointerException calling SpringContextUtil.getActiveProfile() before SpringApplication.run(Application.class, args)
 		SpringApplication.run(Application.class, args);
 	}
 }
 ``````

## Issue 2: Cannot run SpringBootApplication
有时候点了Intellij run/debug SpringBootApplication 之后，工程好像死掉了，而且不能重新run/debug， 因为执行按钮灰掉了。
这个时候检查pom.xml。在我的那次事件里，是由于一个dependency工程里的依赖项（依赖的依赖）下载不下来导致的。

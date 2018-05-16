MBP SETUP
## zsh 
on-my-zsh 安装
1. 克隆仓库
git clone git://github.com/robbyrussell/oh-my-zsh.git ~/.oh-my-zsh
 
2. 如果你已存在~/.zshrc文件，则备份现有的~/.zshrc文件
cp ~/.zshrc ~/.zshrc.orig
 
3. 创建一个新的zsh配置文件
cp ~/.oh-my-zsh/templates/zshrc.zsh-template ~/.zshrc
 
4. 改变默认的Shell
chsh -s /bin/zsh
 
5. 重新启动你的终端（Terminal）

另外，相关的alias可以复制到~/.zshrc文件里，最后使用source更新一下文件即可：
✗ source ~/.zshrc

6. 其他配置
ZSH_THEME="dst"

plugins=(git autojump osx brew node npm)  //zsh 使用的插件

Terminal 系统偏好 Homebrew主题



## 4-1 为什么使用github
**GitHub的特点**<br>
开源的分布式版本管理系统<br>
开源项目集中的代码库<br>
所有略有规模的公司都在使用<br>
**GitHub的功能介绍**<br>
记录多个版本<br>
查看历史操作，可以进行版本回退和前进<br>
多端共享代码，自动合并<br>
**GitHub与SVN**
SVN版本集中管理，所有的代码都在中央服务器上<br>
Git去中心化，每个服务器上都有一个完整的代码库<br>
## 4-2 git客户端安装
**安装Git客户端**
linux: yum install -y git<br>
windows:https://git-scm.com/downloads<br>
mac:brew install git<br>
**检查安装是否成功**
git --version

## 4-3 拥有一个git账号
主页：https://github.com<br>
推荐使用命令行进行操作(git有图形化工具)<br>
![git账号注册1](./img/git账号注册1.png)
![git账号注册2](./img/git账号注册2.png)
![git账号注册3](./img/git账号注册3.png)
![git账号注册4](./img/git账号注册4.png)

## 4-4 github的基本使用ssh-key的客户端配置
**配置sshkey**
生成key：ssh-keygen -t rsa -C "邮箱地址"<br>
cd ~/.ssh(用户目录下的.ssh文件夹)<br>
复制id_rsa.pub的公钥内容到github网站中<br>
**配置多个sshkey**
cd ~/.ssh(用户目录下的.ssh文件夹)<br>
vim config<br>
添加Host/HostName/User/IdentityFile四项<br>
![配置多个git](./img/配置多个git.png)

## 4-6 创建git仓库及克隆、拉取和推送操作
### 创建项目
### 项目的克隆、拉起和推送
git clone：克隆<br>
git status：<br>
git add :<br>
git commit -m "描述说明"：<br>
git push: 推送到GitHub网站<br>
git pull:拉取<br>

## 4-7 项目的分支操作
git branch:查看本地分支<br>
git branch -a:查看远程端分支<br>
git checkout -b branch1:创建本地分支branch1<br>
git push --set upstream origin branch1:<br>
git checkout master:切换到master分支<br>
git branch -d branch1:删除分支本地branch1<br>
git branch -D branch1:强制删除分支本地branch1<br>
git branch -r -d origin/branch1;git push origin :branch1 :删除远程分支branch1;推送到远程<br>

## 4-9 分支操作-合并分支
git merge 分支名：把分支名分支合并到当前分支上<br>
## 4-10 分支操作-解决合并分支的冲突问题
![分支冲突](./img/分支冲突.png)
需要双方商讨协调解决。<br>

## 4-10 项目的版本操作
git reset --hard HEAD^：回退上一版本
git reset --hard HEAD^^^:回退上上个版本
git reset --hard HEAD~10：
git reflog:获取id号
git reset --hard 6575a18:回退到id号为6575a18的版本



## 7-1 moco框架的基本介绍
### Mock平台功能介绍
### Moco框架基本介绍
地址：https://repo1.maven.org/maven2/com/github/dreamhead/moco-runner/0.11.0/
下载moco-runner-0.11.0-standalone.jar    
## 7-2 moco的启动及第一个demo
1、导入moco-runner-0.11.0-standalone.jar包,
2、创建json文件,如创建startup1.json，
```
[
  {
    "description":"这是我们的第一个mock例子",
    "request":{
      "uri":"/demo"
    },
    "response":{
      "text":"这是第一个mock框架demo"
    }
  }
]
```
3、启动服务,命令：java -jar ./moco-runner-0.11.0-standalone.jar http -p 8888 -c startup1.json<br>

## 7-3 Moco框架的http协议get方法Mock实现

## 7-4 在moco中配置post请求

## 7-5 带cookies信息的get请求





## 8-1 在浏览器中如何查看http协议信息头
### 学前预习
慕课网《Jmeter之HTTP协议接口性能测试》
### HTTP协议信息头
**请求头**
![请求头](./img/请求头.png)
## 8-2 请求头信息字段含义介绍
**常用请求头**
Accept:这个头表示，浏览器告诉服务器它所支持的数据类型.<br>
Accept-Charset:这个头表示，浏览器告诉服务器它所采用的字符集。<br>
Accept-Encoding:这个头表示，浏览器告诉服务器它所支持的压缩格式。<br>
Accept-Language:这个头表示，浏览器告诉服务器它所采用的语言。<br>
Host：这个头表示，浏览器告诉服务器我想访问服务器哪台主机。<br>
If-Modified-Since:这个头表示，浏览器告诉服务器它缓存数据时间是多少<br>
Referer：这个头表示，浏览器告诉服务器我是从哪个网页点过来的(防盗链)<br>
User-Agent:这个头表示，浏览器告诉服务器我所使用的浏览器类型、版本等信息<br>
Date：这个头表示，浏览器告诉服务器我什么时间访问的<br>

## 8-3 响应头信息字段含义介绍
### 响应头
![响应头](./img/响应头.png)
### 常用响应头
Location:这个头告诉浏览器你去找谁，配合302状态码使用<br>
Server：这个头告诉浏览器服务器的类型<br>
Content-Encoding:这个头告诉浏览器回送的数据采用的压缩格式。<br>
Content-Type:这个告诉浏览器回送的数据类型<br>
Last-Modified:这个头告诉浏览器数据的最好修改时间<br>
Refresh：这个头用于控制浏览器定时刷新<br>
Content-Disposition：这个头告诉浏览器需要以下载方式打开回送的数据。<br>
Transfer-Encoding:这个头告诉浏览器数据是以分块形式回送的<br>

## 8-4 cookie与session的区别点
### cookie与session区别
cookie在客户端的头信息中<br>
session在服务器存储，文件、数据库等都可以<br>
一般来说session的验证需要cookie带一个字段来表示这个用户是哪一个session，所以当客户端禁用cookie时，session将失效<br>
### cookie总结
![慕课网登录后的cookies](./img/慕课网登录后的cookies.png)<br>
cookie就是小一段文本信息<br>
cookie的格式为key:value;key:value<br>
cookie的值是由服务端生产，客户端保存的。<br>

# SpringBootSampleProject

## 概要
SpringBootのサンプルプロジェクトです。

## 環境構築方法
[Mac + VisualStudioCode + SpringBoot(Java) + Gradle + PostgreSQLでの開発環境構築方法](https://qiita.com/ngnmsn/items/a8c52460739051d60760)

## 簡易的なユーザ登録APIとログインAPIの実装方法
[SpringBoot&PostgreSQLで簡単なユーザ登録APIとログインAPIを実装する](https://qiita.com/ngnmsn/items/636055bcc018783daa7f)

# Java_School_Intermediate_総合問題
ここでは、実務で使用するような開発環境にて、実際に実装～動作確認までを行っていきます。

1. SpringBoot プロジェクトと PostgreSQL の接続
SpringBoot プロジェクトと、PostgreSQL の接続を行い、設定していきます。

※ロジェクト名 「java-sample-pj」※

build.gradle の dependencies の構成
![build gradle の dependencies](https://github.com/DWYNWA/Java_School_Intermediate/assets/153730492/3867f90d-0c6b-4a8a-89f0-82582b7b8b98)

フォルダ構成を作成

<img width="348" alt="フォルダ構成" src="https://github.com/DWYNWA/Java_School_Intermediate/assets/153730492/ff6678f1-d23c-4891-8283-4744ab0f4a1e">

application.yml
アプリケーションの設定ファイル
src/main/resources/application.yml
![application yml](https://github.com/DWYNWA/Java_School_Intermediate/assets/153730492/39e56425-f029-46ff-a92a-37d7091d122f)


mybatis-config.xml
ORマッパー(MyBatis)の設定ファイル
src/main/resources/mybatis-config.xml

head.html
各画面の共通ヘッダ
src/main/resources/templates/common/head.html

list.html
ユーザ一覧画面
src/main/resources/templates/user/list.html

list.css
ユーザ一覧画面用 CSS 
src/main/resources/static/css/list.css

UserMapper.xml
MyBatis のマッパーXML 
src/main/resources/com/example/javasamplepj/domain/mapper/UserMapper.xml

MyBatisConfig.java
MyBatis 設定ファイル 
src/main/java/com/example/javasamplepj/config/MyBatisConfig.java

UserController.java
User 用のコントローラークラス
src/main/java/com/example/javasamplepj/controller/UserController.java

UserService.java
User 用のサービスクラス
src/main/java/com/example/javasamplepj/domain/service/user/UserService.java

UserRepository.java
User 用のリポジトリクラス
src/main/java/com/example/javasamplepj/domain/repository/UserRepository.java

UserMapper.java
MyBatis のマッパーjavaクラス
src/main/java/com/example/javasamplepj/domain/mapper/UserMapper.java

User.java
User 用のエンティティクラス
src/main/java/com/example/javasamplepj/domain/model/user/User.java

UserRequest.java
User 用のリクエストクラス
src/main/java/com/example/javasamplepj/domain/model/user/UserRequest.java



2.プロジェクトの実行と動作確認
プロジェクト起動
プロジェクトを起動し、以下のURLをブラウザで開きます。
list.htmlの内容が表示されれば環境構築／動作確認完了
http://localhost:8080/user/list

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
<img width="738" alt="build gradle の dependencies の構成" src="https://github.com/DWYNWA/Java_School_Intermediate/assets/153730492/1699cb8d-105c-4ab4-82df-4ae7e74f5360">

フォルダ構成を作成

application.yml
アプリケーションの設定ファイルです。
src/main/resources/application.yml


mybatis-config.xml
ORマッパー(MyBatis)の設定ファイルです。
src/main/resources/mybatis-config.xml

head.html
各画面の共通ヘッダです。
src/main/resources/templates/common/head.html

list.html
ユーザ一覧画面です。
src/main/resources/templates/user/list.html

list.css
ユーザ一覧画面用 CSS です。
src/main/resources/static/css/list.css

UserMapper.xml
MyBatis のマッパーXML です。
src/main/resources/com/example/javasamplepj/domain/mapper/UserMapper.xml

MyBatisConfig.java
MyBatis 設定ファイル です。
src/main/java/com/example/javasamplepj/config/MyBatisConfig.java

UserController.java
User 用のコントローラークラスです。
src/main/java/com/example/javasamplepj/controller/UserController.java

UserService.java
User 用のサービスクラスです。
src/main/java/com/example/javasamplepj/domain/service/user/UserService.java

UserRepository.java
User 用のリポジトリクラスです。
src/main/java/com/example/javasamplepj/domain/repository/UserRepository.java

UserMapper.java
MyBatis のマッパーjavaクラスです。
src/main/java/com/example/javasamplepj/domain/mapper/UserMapper.java

User.java
User 用のエンティティクラスです。
src/main/java/com/example/javasamplepj/domain/model/user/User.java

UserRequest.java
User 用のリクエストクラスです。
src/main/java/com/example/javasamplepj/domain/model/user/UserRequest.java



2.プロジェクトの実行と動作確認
プロジェクト起動
プロジェクトを起動し、以下のURLをブラウザで開きます。
list.htmlの内容が表示されれば環境構築／動作確認は完了です。
http://localhost:8080/user/list

3.ユーザ登録画面を作成

ファイルを作成

4.プロジェクトの実行と動作確認

プロジェクト起動
プロジェクトを起動し、以下のURLをブラウザで開きます。
add.htmlの内容が表示、そこから新規登録ができれば動作確認は完了です。
http://localhost:8080/user/add


# Spring Boot User API

このプロジェクトは、Spring Boot を使用して構築したユーザー管理用 REST API です。  
H2 データベースを利用し、ユーザー情報の登録・取得・更新・削除を行う基本的な CRUD 機能を提供します。

学習目的として、以下の技術要素を実践的に組み合わせています：

- Spring Boot による REST API 開発
- Spring Data JPA を用いたリポジトリ層の実装
- H2 Database によるインメモリ DB
- Maven による依存管理
- Java 17 を使用したモダンなアプリケーション構成

このプロジェクトは、バックエンド開発の基礎を理解し、ポートフォリオとして提示できる構成を目指して作成しています。

## ✨ 特徴

- `/users` エンドポイントでユーザー情報を JSON 形式で操作
- H2 Console を利用した DB の可視化
- シンプルで読みやすいコード構成
- Spring Boot の標準構造に沿ったフォルダ設計
- 初学者でも動かしやすい軽量アプリケーション

## 技術スタック

| 分類 | 使用技術 |
|------|-----------|
| 言語 | Java 17 |
| フレームワーク | Spring Boot |
| データベース | H2 Database |
| ORM | Spring Data JPA |
| ビルドツール | Maven |
| 実行方法 | `mvn spring-boot:run` |

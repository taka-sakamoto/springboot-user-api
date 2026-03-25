# Spring Boot User API (with JWT Authentication)

ユーザー管理（CRUD）と JWT 認証を備えた Spring Boot 3 アプリケーションです。  
学習目的で構築しており、認証・認可・データ永続化など、バックエンド開発の基本要素を一通り実装しています。

---

## 🚀 Features

### 🔐 Authentication
- POST `/login`  
  - ユーザー名とパスワードを受け取り、JWT を発行
  - レスポンス例：
    ```json
    {
      "token": "xxxxx.yyyyy.zzzzz"
    }
    ```

### 👤 User CRUD
- GET `/users` — 全ユーザー取得  
- GET `/users/{id}` — ID で取得  
- POST `/users` — 新規作成  
- PUT `/users/{id}` — 更新  
- DELETE `/users/{id}` — 削除  

### 🛡 Security
- Spring Security + JWT による認証  
- 認証が必要なエンドポイントは JWT を `Authorization: Bearer <token>` で送信

---

## 🛠 Tech Stack

| 分類 | 使用技術 |
|------|-----------|
| 言語 | Java 21 |
| フレームワーク | Spring Boot 3.2.5 |
| セキュリティ | Spring Security / JWT |
| データベース | H2 Database |
| ORM | Spring Data JPA |
| ビルドツール | Maven |

---

## ▶️ How to Run

### 1. Clone

- git clone https://github.com/taka-sakamoto/springboot-user-api.git
- cd springboot-user-api

### 2. Run

- mvn spring-boot:run

### 3. Access

- API: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`  
  - JDBC URL: `jdbc:h2:mem:testdb`

---

## 📂 Project Structure
```
src/main/java/com/example/demo/
├── AuthController.java
├── DemoApplication.java
├── HelloController.java
├── JwtAuthenticationFilter.java
├── JwtUtil.java
├── LoginRequest.java
├── LoginResponse.java
├── SecurityConfig.java
├── User.java
├── UserController.java
├── UserRepository.java
└── UserService.java
```

---

## 📝 Notes

- JWT の署名アルゴリズムは HS256  
- 認証フィルターは `JwtAuthenticationFilter`  
- セキュリティ設定は `SecurityConfig`  
- H2 はインメモリ DB のため、アプリ再起動で初期化されます

---

## 📄 Future Improvements

- Refresh Token の導入  
- User ロールによるアクセス制御  
- Integration Test の追加  
- Docker 化

---

## 📜 License

This project is released under the MIT License.


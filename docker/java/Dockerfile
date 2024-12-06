# ビルド用のベースイメージ
FROM maven:3.9.4-eclipse-temurin-21 AS build
# プロジェクトをコピー
COPY . /app
WORKDIR /app
# アプリケーションをビルド
RUN mvn clean package -DskipTests

# 実行用のベースイメージ
FROM openjdk:21
# ビルドステージからjarファイルをコピー
COPY --from=build /app/target/*.jar /app/app.jar
# アプリケーションを実行
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "/app/app.jar"]

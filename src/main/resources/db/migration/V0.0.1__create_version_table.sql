CREATE TABLE IF NOT EXISTS "app_version_history" (
  "id" SERIAL,
  "version" VARCHAR(255) NOT NULL,
  "createdAt" TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
  "updatedAt" TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
  PRIMARY KEY ("id")
);

-- 初期データ挿入
INSERT INTO "app_version_history" ("version", "createdAt", "updatedAt")
VALUES ('0.0.1', NOW(), NOW());

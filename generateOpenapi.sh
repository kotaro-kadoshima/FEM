#!/bin/bash

# プロジェクトディレクトリのルート
PROJECT_ROOT=$(pwd)

# 定義ファイルと設定ファイルのディレクトリ
SPEC_DIR="${PROJECT_ROOT}/openapi/spec"
CONFIG_DIR="${PROJECT_ROOT}/openapi/config"

# 出力先ディレクトリ
OUTPUT_DIR="${PROJECT_ROOT}/src/main/java/com/kk/fem/openapi/gen"

# 一時ディレクトリを使用して生成物を格納
TEMP_GENERATED_DIR="${PROJECT_ROOT}/temp-generated"

# 一時ディレクトリを作成
mkdir -p "${TEMP_GENERATED_DIR}"

# OpenAPI Generator 実行
docker run --rm --name openapi-generator \
  -v "${CONFIG_DIR}:/local/config" \
  -v "${SPEC_DIR}:/local/spec" \
  -v "${TEMP_GENERATED_DIR}:/local/generated" \
  openapitools/openapi-generator-cli generate \
  -c /local/config/openapi-config.yaml \
  --additional-properties=useEclipseFormatter=false

# 生成されたコードを出力先ディレクトリに移動
if [ -d "${TEMP_GENERATED_DIR}/src/main/java/com/kk/fem/openapi/gen/" ]; then
  mkdir -p "${OUTPUT_DIR}"
  cp -r "${TEMP_GENERATED_DIR}/src/main/java/com/kk/fem/openapi/gen/." "${OUTPUT_DIR}"
else
  echo "エラー: 生成物が見つかりません！"
  exit 1
fi

# フォーマット処理 (必要であれば追加)
echo "フォーマットを実行中..."
# ここにフォーマット処理を追加する場合、例えばGoogle Java Formatを使用

# 一時ディレクトリを削除
rm -rf "${TEMP_GENERATED_DIR}"

echo "OpenAPIコードが ${OUTPUT_DIR} に生成されました！"

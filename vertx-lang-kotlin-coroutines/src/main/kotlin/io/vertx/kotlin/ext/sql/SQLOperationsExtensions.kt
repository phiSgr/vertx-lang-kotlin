package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLOperations
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun SQLOperations.query(sql: String): ResultSet {
  return awaitResult { this.query(sql, it) }
}

suspend fun SQLOperations.queryWithParams(sql: String, params: JsonArray): ResultSet {
  return awaitResult { this.queryWithParams(sql, params, it) }
}

suspend fun SQLOperations.queryStream(sql: String): SQLRowStream {
  return awaitResult { this.queryStream(sql, it) }
}

suspend fun SQLOperations.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult { this.queryStreamWithParams(sql, params, it) }
}

suspend fun SQLOperations.querySingle(sql: String): JsonArray {
  return awaitResult { this.querySingle(sql, it) }
}

suspend fun SQLOperations.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray {
  return awaitResult { this.querySingleWithParams(sql, arguments, it) }
}

suspend fun SQLOperations.update(sql: String): UpdateResult {
  return awaitResult { this.update(sql, it) }
}

suspend fun SQLOperations.updateWithParams(sql: String, params: JsonArray): UpdateResult {
  return awaitResult { this.updateWithParams(sql, params, it) }
}

suspend fun SQLOperations.call(sql: String): ResultSet {
  return awaitResult { this.call(sql, it) }
}

suspend fun SQLOperations.callWithParams(
  sql: String,
  params: JsonArray,
  outputs: JsonArray
): ResultSet {
  return awaitResult { this.callWithParams(sql, params, outputs, it) }
}

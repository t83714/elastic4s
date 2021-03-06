package com.sksamuel.elastic4s.testkit

import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient

trait DockerTests extends com.sksamuel.elastic4s.http.ElasticDsl {
  val http = HttpClient(ElasticsearchClientUri("http://localhost:9200"))
}

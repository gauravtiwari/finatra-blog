package com.example

import com.twitter.finagle.httpx.Request
import com.twitter.finatra.http.Controller

class PingController extends Controller {

  get("/ping") { request: Request =>
  	info("ping")
    "pong"
  }

  get("/") { request: Request =>
    "hello world"
  }
}

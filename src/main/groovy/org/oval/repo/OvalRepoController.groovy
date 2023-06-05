package org.oval.repo

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/ovalRepo")
class OvalRepoController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}
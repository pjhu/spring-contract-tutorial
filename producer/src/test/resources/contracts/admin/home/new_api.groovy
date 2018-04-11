package admin.home

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url('/api/v1/new-api')
    }
    response {
        status 200
        body(
                name: "new api"
        )
    }
}

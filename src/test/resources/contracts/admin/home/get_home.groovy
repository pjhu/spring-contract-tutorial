package admin.home

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url('/api/v1/home')
    }
    response {
        status 200
        body(
                name: "pjhu"
        )
    }
}

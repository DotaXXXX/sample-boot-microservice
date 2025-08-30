package lab.microservice.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserServiceProxy {
    
    @GetMapping("/api/users/{id}")
    User retrieveUsername(@PathVariable Long id);
}

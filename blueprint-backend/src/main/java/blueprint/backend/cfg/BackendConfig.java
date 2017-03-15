package blueprint.backend.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@Configuration
@EnableMapRepositories("blueprint.backend")
public class BackendConfig {

}

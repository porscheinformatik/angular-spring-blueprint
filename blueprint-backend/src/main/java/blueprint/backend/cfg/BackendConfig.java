package blueprint.backend.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.keyvalue.core.mapping.context.KeyValueMappingContext;
import org.springframework.data.map.repository.config.EnableMapRepositories;
import org.springframework.data.mapping.model.SimpleTypeHolder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableMapRepositories("blueprint.backend")
public class BackendConfig {

  /**
   * This is needed to use {@link LocalDate}, {@link LocalDateTime} in entities.
   *
   * @return a {@link KeyValueMappingContext}
   */
  @Bean
  public KeyValueMappingContext keyValueMappingContext() {
    KeyValueMappingContext keyValueMappingContext = new KeyValueMappingContext();
    Set<Class<?>> customSimpleTypes = new HashSet<>();
    customSimpleTypes.add(LocalDate.class);
    customSimpleTypes.add(LocalDateTime.class);
    keyValueMappingContext.setSimpleTypeHolder(new SimpleTypeHolder(customSimpleTypes, true));
    return keyValueMappingContext;
  }
}

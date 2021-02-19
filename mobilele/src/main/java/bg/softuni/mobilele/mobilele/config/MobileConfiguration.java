package bg.softuni.mobilele.mobilele.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
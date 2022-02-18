package com.frankmoley.lil.designpatternsapp.singleton;

import org.springframework.stereotype.Component;

// Because that means you auto config with SpringBoot, this will automatically get loaded into the bean factory with that @component annotation.
// So at this point, it is a singleton when it comes to spring.
@Component
public class SingB {
}

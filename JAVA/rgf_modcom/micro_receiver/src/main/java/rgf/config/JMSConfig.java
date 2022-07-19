package rgf.config;
import org.springframework.context.annotation.Configuration;
import jms.JMSBaseConfig;



/**
 * configurações do JMS.
 */
@Configuration
public class JMSConfig extends JMSBaseConfig {
}

// @Configuration
// public class JMSConfig {

//     // Recebe mensagem com tempo expirado (config Servidor).
//     public static final String DEFAULT_EXPIRE = "DEFAULT_EXPIRE";

//     // Armazena mensagens não entregue (config Servidor).
//     public static final String DEFAULT_DEAD_LETTER = "DEFAULT_DEAD_LETTER";

//     // Tentativa de entrega Maxima (config Servidor)
//     public static final Integer MAX_DELIVERY_ATTEMPT = 3;

//     public static final String MESSAGE_TO_RECEIVER = "MESSAGE_TO_RECEIVER";
//     public static final String MESSAGE_TO_MANAGER = "MESSAGE_TO_MANAGER";

//     // Recebe mensagem para o modulo.
//     public static final String MESSAGE_TO_MODULE = "MESSAGE_TO_MODULE";
//     // Inclui mensagem de MESSAGE_TO_MODULE aguardando confirmação por tempo
//     // determinado.
//     public static final String MESSAGE_TO_MODULE_CONFIRM = "MESSAGE_TO_MODULE_CONFIRM";

//     /**
//      * Serialização da mensagem.
//      * 
//      * @return MappingJackson2MessageConverter
//      */
//     @Bean
//     public MessageConverter messageConverter(ObjectMapper objectMapper) {
//         System.out.println("--------- MESSAGE CONVERTER ---------");
//         MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//         converter.setTargetType(MessageType.TEXT);
//         converter.setTypeIdPropertyName("_type");
//         converter.setObjectMapper(objectMapper);
//         return converter;
//     }

// }
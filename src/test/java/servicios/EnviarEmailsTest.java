package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;


class EnviarEmailsTest {

	private EnviarEmails servicio;

    @BeforeEach
    void setUp() {
        servicio = new EnviarEmails(LoggerFactory.getLogger(EnviarEmails.class));
    }
    
    @Test
    void test() {
        assertNotNull(servicio, "El servicio de emails no debe ser nulo");
    }
}

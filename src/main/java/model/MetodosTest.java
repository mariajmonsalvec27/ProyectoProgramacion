package model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MantenimientoTest {

    private GestionMantenimiento gestion;

    @BeforeEach
    public void setUp() {
        gestion = new GestionMantenimiento();
    }

    @Test
    public void testCostoElectricidadConAltura() {
        double resultado = gestion.calcularCostoTotal("ELECTRICIDAD", true);
        assertEquals(70000, resultado, "La prueba pasa si el resultado de 50k + 20k es 70k");
    }

    @Test
    public void testCostoCarpinteriaBase() {
        double resultado = gestion.calcularCostoTotal("CARPINTERIA", false);
        assertEquals(60000, resultado, "La prueba pasa si el resultado no suma herramienta pesada");
    }

    @Test
    public void testRegistroNuevoTecnico() {
        Tecnico nuevoTecnico = new Tecnico("123", "Juan Perez");
        boolean resultado = gestion.registrarTecnico(nuevoTecnico);
        assertTrue(resultado, "La prueba pasa si el tecnico no existia y es agregado con exito");
    }

    @Test
    public void testServiciosPorVivienda() {
        gestion.crearOrdenPrueba("Universidad del Quindio", "ELECTRICIDAD");

        List<String> obtenidos = gestion.obtenerServiciosPorVivienda("Universidad del Quindio");

        List<String> esperados = List.of("ID_SERVICIO_PROG");

        assertIterableEquals(esperados, obtenidos, "Lista con los servicios programados para esa direccion");
    }
}


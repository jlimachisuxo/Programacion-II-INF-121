import java.util.ArrayList;

public class MiTeleferico {
    private ArrayList<Linea> lineas;
    private float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new ArrayList<>();
        this.cantidadIngresos = 0;
    }

    public void agregarPersonaFila(Persona p, String Linea) {
        for (Linea linea : lineas) {
            if (linea.getColor().equals(Linea)) {
                linea.agregarPersona(p);
                break;
            }
        }
    }

    public void agregarCabina(String linea){
        for (Linea l : lineas) {
            if (l.getColor().equals(linea)) {
                Cabina nuevaCabina = new Cabina(l.getCantidadCabinas() + 1);
                l.agregarCabina(nuevaCabina);
                break;
            }
        }
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("MiTeleferico - Cantidad de Ingresos: ").append(cantidadIngresos).append("\n");
        sb.append("Líneas:\n");
        for (Linea linea : lineas) {
            sb.append(linea.mostrar()).append("\n");
        }
        return sb.toString();
    }

    // a)
    public boolean agregarPrimeraPersonaACabina(int nroCabina, String colorLinea) {
        for (Linea linea : lineas) {
            if (!linea.getColor().equals(colorLinea)) continue;

            // obtener fila y cabinas 
            ArrayList<Persona> fila = linea.getFilaPersonas();
            ArrayList<Cabina> cabinas = linea.getCabinas();

            if (fila == null || fila.isEmpty()) return false; // no hay personas en fila
            int index = nroCabina - 1; // se asume numeración desde 1
            if (index < 0 || index >= cabinas.size()) return false; // cabina inexistente

            Cabina cabina = cabinas.get(index);

            // obtener lista actual de personas en la cabina y calcular peso actual
            ArrayList<Persona> personasCabina = cabina.getPersonasAbordo();
            int cantidadActual = personasCabina == null ? 0 : personasCabina.size();
            float pesoActual = 0f;
            if (personasCabina != null) {
                for (Persona pp : personasCabina) {
                    pesoActual += pp.getPesoPersona();
                }
            }

            Persona primera = fila.get(0);

            // validar límites: máximo 10 personas y peso máximo 850 kg
            if (cantidadActual >= 10) return false;
            if (pesoActual + primera.getPesoPersona() > 850f) return false;

            // subir persona a la cabina (se asume que Cabina tiene agregarPersona(Persona))
            cabina.agregarPersona(primera);
            // retirar de la fila
            fila.remove(0);
            return true;
        }
        return false; // línea no encontrada
    }

    // Verifica que todas las cabinas de todas las líneas cumplan las reglas:
    // - como máximo 10 personas
    // - peso total máximo 850 kg
    public boolean verificarReglasAbordo() {
        if (lineas == null) {
            System.out.println("No hay líneas definidas.");
            return true;
        }
        for (Linea linea : lineas) {
            if (linea == null) continue;
            ArrayList<Cabina> cabinas = linea.getCabinas();
            if (cabinas == null) continue;
            for (int i = 0; i < cabinas.size(); i++) {
                Cabina cabina = cabinas.get(i);
                if (cabina == null) continue;
                ArrayList<Persona> personas = cabina.getPersonasAbordo();
                int cantidad = personas == null ? 0 : personas.size();
                float peso = 0f;
                if (personas != null) {
                    for (Persona p : personas) {
                        if (p != null) peso += p.getPesoPersona();
                    }
                }
                if (cantidad > 10) {
                    System.out.println("Línea " + linea.getColor() + " - Cabina " + (i + 1)
                            + ": incumple regla - exceso de personas (" + cantidad + ").");
                    return false;
                }
                if (peso > 850f) {
                    System.out.println("Línea " + linea.getColor() + " - Cabina " + (i + 1)
                            + ": incumple regla - exceso de peso (" + peso + " kg).");
                    return false;
                }
            }
        }
        System.out.println("Todas las cabinas cumplen las reglas de abordo (<=10 personas y <=850 kg).");
        return true;
    }

    public float calcularIngresoTotal() {
        float tarifaRegular = 3.0f;
        float tarifaPreferencial = 1.5f; // descuento aplicado a <25 y >60
        float total = 0f;

        if (lineas == null) return 0f;

        for (Linea linea : lineas) {
            if (linea == null) continue;
            ArrayList<Cabina> cabinas = linea.getCabinas();
            if (cabinas == null) continue;
            for (Cabina cabina : cabinas) {
                if (cabina == null) continue;
                ArrayList<Persona> personas = cabina.getPersonasAbordo();
                if (personas == null) continue;
                for (Persona p : personas) {
                    if (p == null) continue;
                    int edad = p.getEdad();
                    if (edad < 25 || edad > 60) {
                        total += tarifaPreferencial;
                    } else {
                        total += tarifaRegular;
                    }
                }
            }
        }

        this.cantidadIngresos = total;
        System.out.println("Ingreso total calculado es: " + total);
        return total;
    }

    //c)
    public String mostrarLineaConMasIngresoRegular() {
        float tarifaRegular = 3.0f;
        if (lineas == null || lineas.isEmpty()) {
            String msg = "No hay líneas definidas.";
            System.out.println(msg);
            return msg;
        }

        String mejorLinea = null;
        float maxIngreso = 0f;
        boolean anyRegular = false;

        for (Linea linea : lineas) {
            if (linea == null) {
                continue;
            }
            float ingresoLinea = 0f;
            ArrayList<Cabina> cabinas = linea.getCabinas();
            if (cabinas == null) continue;

            for (Cabina cabina : cabinas) {
                if (cabina == null) continue;
                ArrayList<Persona> personas = cabina.getPersonasAbordo();
                if (personas == null) continue;

                for (Persona p : personas) {
                    if (p == null) continue;
                    int edad = p.getEdad();
                    if (edad >= 25 && edad <= 60) {
                        ingresoLinea += tarifaRegular;
                        anyRegular = true;
                    }
                }
            }

            if (ingresoLinea > maxIngreso) {
                maxIngreso = ingresoLinea;
                mejorLinea = linea.getColor();
            }
        }

        String mensaje;
        if (!anyRegular) {
            mensaje = "No hay ingresos por tarifa regular en ninguna línea.";
        } else {
            mensaje = "La línea con mayor ingreso por tarifa regular es: " + mejorLinea
                    + " con ingreso: " + maxIngreso;
        }
        System.out.println(mensaje);
        return mensaje;
    }


}

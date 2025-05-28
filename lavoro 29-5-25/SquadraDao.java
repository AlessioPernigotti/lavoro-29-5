import java.util.HashMap;
import java.util.Map;

public class SquadraDao implements Dao<SquadraNBA> {
    private Map<Integer, SquadraNBA> database = new HashMap<>();

    @Override
    public void salva(SquadraNBA squadra) {
        database.put(squadra.getId(), squadra);
    }

    @Override
    public SquadraNBA trovaPerId(int id) {
        return database.get(id);
    }

    @Override
    public void aggiorna(SquadraNBA squadra) {
        database.put(squadra.getId(), squadra);
    }

    @Override
    public void elimina(int id) {
        database.remove(id);
    }
}

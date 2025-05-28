public class SquadraRepositoryImpl implements SquadraRepository {
    private Dao<SquadraNBA> squadraDao;

    public SquadraRepositoryImpl(Dao<SquadraNBA> dao) {
        this.squadraDao = dao;
    }

    @Override
    public void registraSquadra(SquadraNBA squadra) {
        squadraDao.salva(squadra);
    }

    @Override
    public SquadraNBA trovaSquadra(int id) {
        return squadraDao.trovaPerId(id);
    }
}

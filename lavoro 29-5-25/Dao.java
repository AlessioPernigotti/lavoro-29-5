public interface Dao<T> {
    void salva(T t);
    T trovaPerId(int id);
    void aggiorna(T t);
    void elimina(int id);
}

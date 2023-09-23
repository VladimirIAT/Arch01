package InMemoryModel;

// Интерфейс смены модели
public interface IModelChanger {
    public void notifyChange(IModelChanger sender);    
}

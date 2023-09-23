package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Scene;
import ModelElements.Texture;
import ModelElements.Flash;
import ModelElements.PoligonalModel;

public class ModelStore implements IModelChanger{

    public ModelStore(IModelChangedObserver[] changedObservers) throws Exception {
        this.changeObservers = changedObservers;
        this.models = new ArrayList<>(null);
        this.scenes = new ArrayList<>(null);
        this.flashes = new ArrayList<>(null);
        this.cameras = new ArrayList<>(null);

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(0, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());        
    }

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private IModelChangedObserver[] changeObservers;

    // Регистрирует изменения модели
    @Override
    public void notifyChange(IModelChanger sender) {

    }
    
    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return null;
            }
        }
        return null;
    }
}

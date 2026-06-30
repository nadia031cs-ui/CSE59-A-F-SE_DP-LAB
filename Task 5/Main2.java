interface OptimizableModel {

    void quantize();
}
class ResNet18 implements OptimizableModel {

    @Override
    public void quantize(){
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}
class MobileNet implements OptimizableModel {
    @Override
    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}
class InferenceEngine{
    public void optimizeModel(OptimizableModel model){
        model.quantize();
    }
}
public class Main2{
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();
        OptimizableModel resnet = new ResNet18();
        OptimizableModel mobile=new MobileNet();

         engine.optimizeModel(resnet);
         engine.optimizeModel(mobile);
    }
}

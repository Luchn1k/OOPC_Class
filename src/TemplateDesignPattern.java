abstract class TemplateDesignPattern {
    protected  abstract  void initialize();
    protected abstract  void startPlay();
    protected abstract  void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}


class Cricket extends  TemplateDesignPattern{

    @Override
    protected void initialize() {
        System.out.println("init");
    }

    @Override
    protected void startPlay() {
        System.out.println("stat");
    }

    @Override
    protected void endPlay() {
        System.out.println("end");
    }

}

class  TestTemplate{
    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.play();
        c.endPlay();
    }
}

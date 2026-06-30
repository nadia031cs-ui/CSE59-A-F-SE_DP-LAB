interface Researcher{
    void conductLabResearch();
}

class UniversityMember{
        public void attendLecture(){
            System.out.println("Attending a lecture.");
        }
}

class UndergraduateStudent extends UniversityMember{
    //only attends lecture
}
class GraduateResearchAssistant extends UniversityMember implements Researcher{
    @Override
    public void conductLabResearch(){
        System.out.println("Publising papers and running experiments.");
    }
}
class Professor extends UniversityMember implements Researcher{
    @Override
    public void conductLabResearch(){
        System.out.println("Publishing papers and runnnimg experiments");
    }

}











public class Main5 {
   public static void main(String[] args) {
    

    UniversityMember student = new UndergraduateStudent();
    student.attendLecture();

    GraduateResearchAssistant gra = new GraduateResearchAssistant();
    gra.attendLecture();
    gra.conductLabResearch();

    Professor professor= new Professor();
    professor.attendLecture();
    professor.conductLabResearch();
   } 
}


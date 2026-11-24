class UnivercityMember{
  int memberid ;
  void checkin(){
    System.out.println("memeber checked in "+memberid);
  }
}
class staff extends UnivercityMember{
  String dep;
  void attendMeeting(){
    System.out.println("meeting attending");
  }
}
class Professor extends staff{
  String subject;
  void conductLecture(){
    System.out.println(" teaching :"+subject);
  }
}
class AdminOfficer extends staff{
int officeroom;
void processFiles(){
  System.out.println("files are processing");
}
}
public class inheritanceTask4 {
  public static void main(String[] args) {
    Professor obj = new Professor();
    AdminOfficer obj1=new AdminOfficer();
    obj.attendMeeting();
    obj1.attendMeeting();
    obj.memberid=999;
    obj.memberid=1000;
    obj.checkin();
    obj1.checkin();
  }
  
}
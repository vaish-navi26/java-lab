package ass_5;
import java.util.*;
class Enroll {
ArrayList<Integer> m_course_id = new
ArrayList<Integer>();
ArrayList<String> m_student_name = new
ArrayList<String>();
ArrayList<Integer> m_student_id = new
ArrayList<Integer>();
ArrayList<Integer> e_course_id = new
ArrayList<Integer>();
ArrayList<String> e_student_name = new
ArrayList<String>();
ArrayList<Integer> e_student_id = new
ArrayList<Integer>();
void add(int cd, String cname, String sname, int sd) {
if (cname.equals("maths")) {
m_course_id.add(cd);
m_student_name.add(sname);
m_student_id.add(sd);
} else {
e_course_id.add(cd);
e_student_name.add(sname);
e_student_id.add(sd);
}
System.out.println("Successfully Added");
}
void change(String sname, String newname, String cname)
{
int i = 0;
if (cname.equals("english")) {
while (!(e_student_name.get(i).equals(sname))) {
i++;
}
e_student_name.set(i, newname);



System.out.println("Successfully Changed");
} else {
while (!(m_student_name.get(i).equals(sname))) {
i++;
}
m_student_name.set(i, newname);
System.out.println("Successfully Changed");
}
}
void number(String cname) {
if (cname.equals("maths")) {
System.out.println("No. of students in maths : "
+ m_student_name.size());
} else {
System.out.println("No. of students in english :
" + e_student_name.size());
}
}
void remove(String cname, String sname) {
int i = 0;
if (cname.equals("english")) {
while (!(e_student_name.get(i).equals(sname))) {
i++;
}
e_student_name.remove(i);
e_course_id.remove(i);
e_student_id.remove(i);
System.out.println("Successfully removed");
} else {
while (!(m_student_name.get(i).equals(sname))) {
i++;
}
m_student_name.remove(i);
m_course_id.remove(i);
m_student_id.remove(i);
System.out.println("Successfully removed");
}
}
void removeall(String cname) {
if (cname.equals("maths")) {


m_student_name.clear();
m_course_id.clear();
m_student_id.clear();
System.out.println("Successfully removed all");
} else {
e_student_name.clear();
e_course_id.clear();
e_student_id.clear();
System.out.println("Successfully removed all");
}
}
void check(String sname, String cname) {
boolean ans;
if (cname.equals("maths")) {
ans = m_student_name.contains(sname);
if (ans)
System.out.println("The student has already
enrolled");
else
System.out.println("The student has not
enrolled yet");
} else{
ans = e_student_name.contains(sname);
if (ans)
System.out.println("The student has already
enrolled");
else
System.out.println("The student has not
enrolled yet");
}
}
void see(String cname) {
int i;
if (cname.equals("maths")) {
for (i = 0; i < m_student_name.size(); i++) {
System.out.println(i + 1);
System.out.println("Student name: " +
m_student_name.get(i));
System.out.println("Student id: " +
m_student_id.get(i));



System.out.println("Course id: " +
m_course_id.get(i));
}
if(m_student_name.isEmpty())
{
System.out.println("no student found");
}
} else {
for (i = 0; i < e_student_name.size(); i++) {
System.out.println(i + 1);
System.out.println("Student name: " +
e_student_name.get(i));
System.out.println("Student id: " +
e_student_id.get(i));
System.out.println("Course id: " +
e_course_id.get(i));
}
if(e_student_name.isEmpty())
{
System.out.println("no student found");
}
}
}
}
public class a5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String cname, sname, nname;
int ch = 0, cid, sid;
Enroll obj = new Enroll();
while (ch != 8) {
sc.nextLine();
System.out.println("Enter the course name : ");
cname = sc.nextLine();
System.out.println("1. To enroll course ");
System.out.println("2. To change name ");
System.out.println("3. To see no. of students
");
System.out.println("4. To remove student ");



System.out.println("5. To remove all students
");
System.out.println("6. To check if student has
enrolled or not ");
System.out.println("7. To see course details ");
System.out.println("8. Exit");
ch = sc.nextInt();
sc.nextLine(); // Consume newline left-over
if (ch == 1) {
System.out.println("Enter the student name :
");
sname = sc.nextLine();
System.out.println("Enter the course id :
");
cid = sc.nextInt();
System.out.println("Enter the student id :
");
sid = sc.nextInt();
obj.add(cid, cname, sname, sid);
} else if (ch == 2) {
System.out.println("Enter the student name :
");
sname = sc.nextLine();
System.out.println("Enter the new name : ");
nname = sc.nextLine();
obj.change(sname, nname, cname);
} else if (ch == 3) {
obj.number(cname);
} else if (ch == 4) {
System.out.println("Enter the student name :
");
sname = sc.nextLine();
obj.remove(cname, sname);
} else if (ch == 5) {
obj.removeall(cname);
} else if (ch == 6) {
System.out.println("Enter the student name :
");
sname = sc.nextLine();
obj.check(sname, cname);
} else if (ch == 7) {


obj.see(cname);
}
}
}
}

Output :

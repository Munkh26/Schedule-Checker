import java.util.ArrayList;

public class CanAttend {

	//precondition: Have a ArrayList with some different schedule times in it
	//postcondition: It will return either if you can attend or you cannot attend the scheduled meetings
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
		System.out.println(meetings);
		for (int i = 0; i < meetings.size(); i++) {
			for (int j = i + 1; j < meetings.size(); j++) {
				if (meetings.get(i).getStart() < meetings.get(j).getEnd() && meetings.get(i).getEnd() > meetings.get(j).getStart()) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
		ArrayList<MeetingInterval> meet2 = new ArrayList<MeetingInterval>();
		meet2.add(new MeetingInterval(100, 200));
		meet2.add(new MeetingInterval(10, 20));
		System.out.println(canAttend(meet2) ? "There is no conflict with attending "+meet2+" meetings":"Can't attend "+meet2+" meetings due to conflict");
	}
}

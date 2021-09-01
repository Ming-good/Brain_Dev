import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException, NoSuchAlgorithmException {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		Main main = new Main();
		System.out.println(main.solution(participant, completion));
		
	}	
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap map = new HashMap();
		hashInsert(map, completion);
		answer = hashSearch(map, participant);
		
		return answer;
	}	
	
	public void hashInsert(HashMap map, String[] completion) {
		
		for(int i=0;i<completion.length;i++) {
			if(map.containsKey(completion[i])) {
				int value = (int) map.get(completion[i]);
				map.put(completion[i], value+1);
			} else {
				map.put(completion[i], 1);
			}
			
		}
	}
	
	public String hashSearch(HashMap map, String[] participant) {
		for(int i=0;i<participant.length;i++) {

			if(map.containsKey(participant[i])) {
				int value = (int) map.get(participant[i]);
				if(value == 0) {
					return participant[i];
				}
				map.put(participant[i], value-1);
			} else {
				return participant[i];
			}
		}
		
		return "";
	}
}
package day08;

public class TeamGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		래스명 : TeamGenerator
		(2차원 배열 사용)

		체육 대회를 하기 위해서  족구 팀을 나누려 한다.

		족구 팀에 배정할수 있는 인원은 총 30명이다.
		String[] player = {“조장1”, “조장2”, “조장3”, “조장4”, “조장5”, …….}

		String team = new String[5][6];
		총 5팀으로 구성한다.

		각 팀의 조장은 조장1 ~ 조장5 까지 랜덤하게 배정한다.
		다른 팀에 조장으로 한번 배정되면 또다른 팀에 조장으로 배정할수 없다.

		나머지 학생들을 각 팀원으로 배정하여 총 5팀을 렌덤하게 구성하여 출력한다.
		각 팀원들도 한 팀에만 배정되어야 한다.

		최종적으로 5개의 배열에 각 학생들이 참조 되게 처리한다.
		결과는 렌덤 하게 구성 되어야 한다.

		최종 출력결과
		1팀
		조장 : 조장1 
		팀원 : 아무개1, 아무개2, 아무개3, 아무개4, , 아무개5

		2팀:…….
        */
		
		String team[][] = new String[5][6];
		String leader[] = new String[5];
		
		String[] player = {"조장1", "조장2", "조장3", "조장4", "조장5",
				"아무개1","아무개2","아무개3","아무개4","아무개5",
				"아무개6","아무개7","아무개8","아무개9","아무개10",
				"아무개11","아무개12","아무개13","아무개14","아무개15",
				"아무개16","아무개17","아무개18","아무개19","아무개20",
				"아무개21","아무개22","아무개23","아무개24","아무개25",
				};
		
		//1. 팀장 배정
		//2. 팀원을 랜덤 배정, 비복원추출
	   
	   //내가 풀은 
	   

	
	   for ( int i = 0; i < team.length; i++ ) {
		    int index = (int)(Math.random() * 5);
		    
		   if(player[index] == null ) {
		      i--;
		   } else {
		    System.out.println(i + "팀");
		    System.out.println("팀장 :" + team[i][0]);
		   
		    team[i][0] = player[index];
		    player[index] = null; 
		   }
	      for( int j = 1; j < index; j++) {
	         int playerIndex = (int)(Math.random()*25)+5;
	         
	         if(player[playerIndex] == null){
	           j--;
	         } else{
	           team[i][j] = player[playerIndex];
	           player[playerIndex] = null;
	           System.out.println("팀원 : "  );		      
			   System.out.println(team[i][j] + " ");
	          }
	        System.out.println("\n");
	        }
		   }
          /*		
		  //교수님 풀이:
		  //팀장
		  for (int i = 0; i < team.length; i++) {
			  //각팀에 배정할 팀장명이 저장된 player 배열의 인덱스 번호를 0번 부터 4번 인덱스 까지 랜덤하게 얻어 옴
			  
			  //한번 팀장 이름으로 사용된 인덱스 번호값은 사용된 값이라고 표시를 해두
			 int leaderIndex = (int)(Math.random() * 5); //0 ~ 4
			 
			 //i == 1, i == 2
			 if(player[leaderIndex] == null) {
			    i--;
				 
			 } else {
			 team[i][0] = player[leaderIndex];
             player[leaderIndex] = null;
			 }
		  }
		
		for(int i = 0; i < team.length; i++) {
			System.out.println((i + 1) + "팀장명 : " + team[i][0]);
		}
		
		//팀원 배정
		for(int i = 0; i < team.length; i++) {
			for(int j = 1; j < team[i].length; j++) {
	            int memberIndex = (int)(Math.random() * 25) + 5;
	            
	            if(player[memberIndex] == null) {
	            	j--;
	            }else {
	            	team[i][j] = player[memberIndex];
	            	player[memberIndex] = null;
	            }
	            
			}
		}
		
		//출력(팀원 출력이 않됨!!!)
		for (int i = 0; i < team.length; i++) {
			System.out.println((i + 1) + "팀장: " + team[i][0]);
			
			System.out.println("팀원 : ");
		    for(int j = 1; j < team[i].length; j++) {
		    	System.out.print(team[i][j] + " ");
		    }
		    System.out.println("\n");
		}
       */
	}

}

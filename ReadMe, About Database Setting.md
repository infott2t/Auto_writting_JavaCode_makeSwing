스마트 기기. 안전하게 사용합시다.
Let's safely use smartphones,etc. 


DataBase가 되는 컴퓨터. 리눅스.. 이렇게 생각할 수있죠.

SQL. 
lower_case_table_names 대소문자 인식, 1값으로 셋팅하면 됨니다. 다 소문자로 인식이 되요. 
스프링 부트, 프로그래밍에서, 카멜케이스를 사용할 때에, _ 로 바뀌어서, 소문자 형태. 이렇게, DataBase에 저장되게 해줘야합니다. 

그러니까, Entity가 되는 Java. 텍스트 파일. AbcTn.java. 이 파일을 예를 들면...  클래스명은, AbcTn 이렇게 됨니다. 저장되는 DB테이블 명은, abc_tn 이렇게 됨니다.

아래의 작업을 해주세요.

lower_case_table_names의 값을 1로 바꿔주면 됨니다.



SQL>SHOW VARIABLES LIKE 'lower_case_table_names'
0 - 쿼리시, 테이블명 대,소문자 구분함.
1 - 쿼리시, 테이블명이 대, 소문자든 무조건 소문자로 인식.
2 - 윈도우에서 테이블 명을 대,소문자를 구분해서 생성.

--
또, 스프링부트에서, strateragy 전략 방법을 선택해서 한것 같은데... 없네요. 그대로 하면 되나봄니다... 이 부분은 다시 또 봐야 할것 같네요. 나중에 알게되면, 알려드릴게요. 인터넷 검색해보세요~. 
application.properties, application-real.properties. 이런 파일내에 설정방법이군요.


교회. 다녀보세요. 기독교. 전화도 해보세요. 하고 싶은 말이군요.
Let's go to church. Jesus Christ. Let's calling. I like this comment.

저의 글, 봐 주셔서 감사합니다.
Thank you, watching on my writting. Thank you.



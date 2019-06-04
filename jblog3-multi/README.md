# JBLOG 최종수정
# WEB.XML + JAVA CONFIG Ver 수정
---
* Interceptor - 접근권한설정
	- authAdmin 어노테이션 설정끝
* 카테고리 처음 생성에 안뜨는 오류 수정 -- left join
* 실제물리적으로 가져오는 이미지 경로와 가상경로 분리 충돌방지
* 컨트롤러 서비스단 로직 분리
* workspace 드라이브에 /jblog-uploads/profile 폴더생성필요

✂오류수정
---
* xml에서 config버전으로 옮길때 securityconfig Import 조심 (이유없이 catalina로 임포트 될때 있는데 오류도 안뜸)
* 경로를 인터셉터로 못찾아갈시 컨트롤러에 RequestMapping 경로를 설정해주고 빈 메서드 만들어주면 찾아가진다함 (난 정상됨)

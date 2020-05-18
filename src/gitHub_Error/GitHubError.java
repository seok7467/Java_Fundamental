package gitHub_Error;
/*
 * 1. [push할 떄 Updates were rejected because the tip of your current branch is behind 오류 뜰 때]
 * 다른 사람이 github의 파일을 업데이트 했기 때문에 발생하는 오류
 * ->
 * git pull origin master 하고 다시 시도해본다.
 * 그래도 에러 뜨면 
 * git pull origin 브런치명 --allow-unrelated-histories 하고 시도한다.
 * 
 * 이 명령 옵션은 이미 존재하는 두 프로젝트의 기록(history)을 저장하는 드문 상황에 사용된다고 한다.
 * 즉, git에서는 서로 관련 기록이 없는 이질적인 두 프로젝트를 병합할 때 기본적으로 거부하는데, 이것을 허용해 주는 것이다.
 * 
 * 
 * 
 * 
 * 
 * 
 */

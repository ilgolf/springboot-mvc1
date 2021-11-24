package hello.springmvc.basic;

//import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // 출력문 만 찍히므로 디버깅시 불리 및 운영서버도 무조건 다 뜨기 때문에 그 요청을 감당하기 힘듬
        System.out.println("name = " + name);

        // log.trace("trace my log = " + name );  <- 연산이 일어나 메모리를 낭비하게 됨 사용안하는게 좋음

        // [실행한 스레드] hello.springmvc.basic.LogTestController  :  로그
        // 단계 별로 필요한 로그만 찍을 수 있기에 왠만하면 로그를 사용하여 원하는 로그만 나오게 해야한다.
        log.trace("trace log = {}", name); // 로컬 서버 단계
        log.debug("debug log = {}", name); // 개발 서버 단계
        log.info(" info log = {}", name); // 운영 서버 단계
        log.warn(" warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}

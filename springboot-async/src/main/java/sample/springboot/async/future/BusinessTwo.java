package sample.springboot.async.future;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class BusinessTwo {

  private static final Logger logger = LoggerFactory.getLogger(BusinessTwo.class);

  @Async
  public Future<String> deal() throws Exception {
    long sleep = (long) (Math.random() * 1000 * 5);
    Thread.sleep(sleep);

    logger.info("业务2处理了{}", sleep);

    return new AsyncResult<String>("业务2处理完成");
  }

}

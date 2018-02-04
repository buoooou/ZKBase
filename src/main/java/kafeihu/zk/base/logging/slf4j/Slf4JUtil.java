package kafeihu.zk.base.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangkuo on 2017/8/25.
 */
public class Slf4JUtil {

    private static Logger m_monitorLogger = LoggerFactory.getLogger("monitor");
    private static Logger m_zkchatLogger = LoggerFactory.getLogger("zkchat");
    private static Logger m_sysLogger = LoggerFactory.getLogger("system");
    private static Logger m_consoleLogger = LoggerFactory.getLogger("console");

    /**
     * 获取系统日志处理器
     *
     * @return
     */
    public static Logger getSysLogger() {

        return m_sysLogger;
    }

    /**
     * 获取指定模块关联的日志处理器
     *
     * @return
     */
    public static Logger getZKChatLogger() {
        return m_zkchatLogger;
    }

    /**
     * 获取指定模块关联的日志处理器
     *
     * @return
     */
    public static Logger getMonitorLogger() {
        return m_monitorLogger;
    }

    /**
     * 获取控制器模块
     *
     * @return
     */
    public static Logger getConsoleLogger() {
        return m_consoleLogger;
    }
}

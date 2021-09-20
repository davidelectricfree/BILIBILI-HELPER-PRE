package top.misec.push.model;

import lombok.Builder;
import lombok.Getter;

/**
 * 元信息.
 *
 * @author itning
 * @since 2021/3/22 16:58
 */
@Getter
@Builder
public class PushMetaInfo {

    /**
     * TOKEN.
     */
    private final String token;

    /**
     * Telegram Chat Id .
     */
    private final String chatId;

    /**
     * 密钥
     */
    private final String secret;

}

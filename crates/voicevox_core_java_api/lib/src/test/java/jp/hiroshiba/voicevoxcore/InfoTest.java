/*
 * GlobalInfoのテスト。
 */
package jp.hiroshiba.voicevoxcore;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class InfoTest extends TestUtils {
  @Test
  void checkVersion() {
    assertNotNull(GlobalInfo.getVersion());
  }

  // TODO: 別の場所に移す
  @Test
  void checkSupportedDevices() {
    SupportedDevices supportedDevices = loadOnnxruntime().supportedDevices();

    assertNotNull(supportedDevices);
  }
}

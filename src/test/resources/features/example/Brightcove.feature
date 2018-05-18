@Brightcove
Feature: Brightcove


  Scenario Outline: Brightcove video
    Given I launch '<url>' in headless browser
    When I grab the network logs
    Then The brightcove video is available

  Examples:
  | url                  |
  | https://my.hrw.com/wl2/wl13/bien_dit/student/level2/library/video/video.html?videoxml=1696328379001  |
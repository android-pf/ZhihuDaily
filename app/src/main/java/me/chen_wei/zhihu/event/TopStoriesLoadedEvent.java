package me.chen_wei.zhihu.event;

import me.chen_wei.zhihu.network.model.Latest;

/**
 * Created by Hander on 16/2/27.
 * <p/>
 * Email : hander_wei@163.com
 */
public class TopStoriesLoadedEvent {

    public Latest latest;

    public TopStoriesLoadedEvent(Latest latest){
        this.latest = latest;
    }
}

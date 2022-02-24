package com.inma.botlmdshow.service

import com.inma.botlmdshow.domain.Datum
import com.inma.botlmdshow.utils.DatumUtils
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import twitter4j.TwitterException
import twitter4j.TwitterFactory
import twitter4j.auth.AccessToken
import twitter4j.createTweet

/**
 * Using io.github.takke:jp.takke.twitter4j-v2 because the Twitter v2 Api Documentation
 * IS SUCH A HORRIBLE MESS
 * THAT I WASTED SEVERAL HOURS TO TRY TO POST A TWEET
 */
@Service
class TwitterServiceImpl() : TwitterService {
    @Value("\${twitter.key}")
    private val key: String? = null;

    @Value("\${twitter.secret}")
    private val secret: String? = null;

    @Value("\${twitter.token}")
    private val token: String? = null;

    @Value("\${twitter.tokenSecret}")
    private val tokenSecret: String? = null;
    override fun postTweet(datum: Datum): Boolean {
        val twitter = TwitterFactory().instance
        twitter.setOAuthConsumer(key, secret)
        val accessToken = AccessToken(token, tokenSecret)
        twitter.oAuthAccessToken = accessToken
        try {
            val status = twitter.createTweet(text = DatumUtils.formText(datum))
            log.info("Postee algo {}", status.id)
            return true
        } catch (e: TwitterException) {
            log.error("Cogi un error! {}", e.errorMessage)
            return false
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(TwitterServiceImpl::class.java)
    }
}
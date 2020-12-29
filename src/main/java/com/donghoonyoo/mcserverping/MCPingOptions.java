/*
 * Copyright 2014 jamietech. All rights reserved.
 * https://github.com/jamietech/MinecraftServerPing
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ''AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and contributors and should not be interpreted as representing official policies,
 * either expressed or implied, of anybody else.
 */
package com.donghoonyoo.mcserverping;

import com.google.common.base.Charsets;

/**
 * Storage class for {@link MinecraftPing} options.
 */
public class MCPingOptions {

    private String hostname;

    private String charset = Charsets.UTF_8.displayName();

    private int port = 25565;

    private int timeout = 5000;

    MCPingOptions(String hostname, String charset, int port, int timeout) {
        this.hostname = hostname;
        this.charset = charset;
        this.port = port;
        this.timeout = timeout;
    }

    private static String $default$charset() {
        return Charsets.UTF_8.displayName();
    }

    private static int $default$port() {
        return 25565;
    }

    private static int $default$timeout() {
        return 5000;
    }

    public static MCPingOptionsBuilder builder() {
        return new MCPingOptionsBuilder();
    }

    public String getHostname() {
        return this.hostname;
    }

    public String getCharset() {
        return this.charset;
    }

    public int getPort() {
        return this.port;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public static class MCPingOptionsBuilder {
        private String hostname;
        private String charset$value;
        private boolean charset$set;
        private int port$value;
        private boolean port$set;
        private int timeout$value;
        private boolean timeout$set;

        MCPingOptionsBuilder() {
        }

        public MCPingOptionsBuilder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        public MCPingOptionsBuilder charset(String charset) {
            this.charset$value = charset;
            this.charset$set = true;
            return this;
        }

        public MCPingOptionsBuilder port(int port) {
            this.port$value = port;
            this.port$set = true;
            return this;
        }

        public MCPingOptionsBuilder timeout(int timeout) {
            this.timeout$value = timeout;
            this.timeout$set = true;
            return this;
        }

        public MCPingOptions build() {
            String charset$value = this.charset$value;
            if (!this.charset$set) {
                charset$value = MCPingOptions.$default$charset();
            }
            int port$value = this.port$value;
            if (!this.port$set) {
                port$value = MCPingOptions.$default$port();
            }
            int timeout$value = this.timeout$value;
            if (!this.timeout$set) {
                timeout$value = MCPingOptions.$default$timeout();
            }
            return new MCPingOptions(hostname, charset$value, port$value, timeout$value);
        }

        public String toString() {
            return "MCPingOptions.MCPingOptionsBuilder(hostname=" + this.hostname + ", charset$value=" + this.charset$value + ", port$value=" + this.port$value + ", timeout$value=" + this.timeout$value + ")";
        }
    }
}

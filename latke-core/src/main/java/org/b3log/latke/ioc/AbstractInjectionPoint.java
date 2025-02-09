/*
 * Latke - 一款以 JSON 为主的 Java Web 框架
 * Copyright (c) 2009-present, b3log.org
 *
 * Latke is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *         http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */
package org.b3log.latke.ioc;

import org.b3log.latke.ioc.annotated.Annotated;

/**
 * Abstract injection point.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.1, Sep 29, 2018
 * @since 2.4.18
 */
public abstract class AbstractInjectionPoint implements InjectionPoint {

    /**
     * Annotated element.
     */
    private Annotated annotated;

    /**
     * Owner bean.
     */
    private Bean<?> ownerBean;

    /**
     * Constructs a injection point with the specified arguments.
     *
     * @param ownerBean the specified owner bean
     * @param annotated the specified annotated element
     */
    public AbstractInjectionPoint(final Bean<?> ownerBean, final Annotated annotated) {
        this.ownerBean = ownerBean;
        this.annotated = annotated;
    }

    @Override
    public Bean<?> getBean() {
        return ownerBean;
    }

    @Override
    public Annotated getAnnotated() {
        return annotated;
    }
}

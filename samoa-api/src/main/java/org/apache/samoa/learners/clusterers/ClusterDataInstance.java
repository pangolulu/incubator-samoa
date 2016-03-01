package org.apache.samoa.learners.clusterers;

/*
 * #%L
 * SAMOA
 * %%
 * Copyright (C) 2014 - 2016 Apache Software Foundation
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.samoa.learners.DataInstance;

public class ClusterDataInstance implements DataInstance {
    private int numAtts;
    private int timeStamp;
    private double[] data;

    public ClusterDataInstance(int numAtts, int timeStamp, double[] data) {
        this.numAtts = numAtts;
        this.timeStamp = timeStamp;
        this.data = data;
    }

    public int getNumAtts() {
        return numAtts;
    }

    public void setNumAtts(int numAtts) {
        this.numAtts = numAtts;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }
}
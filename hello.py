#-*-   coding :utf-8   -*-
# ---version 0.1  2017-09-12 ---

'test'
__author__ ='ywbin'
__date__ = '2018-09-28'

import sys

def test():
    args = sys.argv
    if len(args) ==1:
        print 'Hello world!'
        pass
    elif len(args) ==2:
        print 'Hello, %s!' %args[1]
        pass
    else:
        print 'Too many arguments!'
        pass
    pass
if __name__ == '__main__':
    test()
    pass
